package com.nocol.pattern.structure.Flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

//数据库连接池
public class ConnectionPool {  
      
    private Vector<Connection> pool;  
      
    /*公有属�??*/  
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";  
    private String username = "nocol";  
    private String password = "123";  
    private String driverClassName = "oracle.jdbc.OracleDriver";  
  
    private int poolSize = 100;  
//  这里对instance可以使用�?个单例模�?
    @SuppressWarnings("unused")
	private static ConnectionPool instance = null;  
    Connection conn = null;  
  
    /*构�?�方法，做一些初始化工作*/  
    private ConnectionPool() {  
        pool = new Vector<Connection>(poolSize);  
  
        for (int i = 0; i < poolSize; i++) {  
            try {  
                Class.forName(driverClassName);  
                conn = DriverManager.getConnection(url, username, password);  
                pool.add(conn);  
            } catch (ClassNotFoundException e) {  
                e.printStackTrace();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
  
    /* 把连接对象返回到连接�? */  
    public synchronized void release() {  
        pool.add(conn);  
    }  
  
    /* 返回连接池中的一个数据库连接 */  
    public synchronized Connection getConnection() {  
        if (pool.size() > 0) {  
            Connection conn = pool.get(0);  
            pool.remove(conn);  
            return conn;  
        } else {  
            return null;  
        }  
    }  
}
