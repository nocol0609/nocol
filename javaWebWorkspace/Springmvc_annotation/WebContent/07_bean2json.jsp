<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<script type="text/javascript" src="jquery-1.8.3.min.js"></script>
  </head>
  <body> 
   
   <input type="button" value="Emp转JSON"/><p>

   <input type="button" value="List<Emp>转JSON"/><p>

   <input type="button" value="Map<String,Object>转JSON"/><p>
   
   <!-- Emp转JSON -->	  
   <script type="text/javascript">
   /* 		$(":button:first").click(function(){
   			$.ajax({
   				 type:"POST",
   				 url:"${pageContext.request.contextPath}/emp2/bean2json.action",
   				 sendDate:null,
   				 dataType:"json",
   				 success:function(backDate){
   				 	var hiredate = backData.hiredate;
   					var date = new Date(hiredate);
   					alert(date.getFullYear()+"年"+(date.getMonth()+1)+"月"+(date.getDate())+"日"); 
   				 }
   			})
   		}); */
   		
   		$(":button:first").click(function(){
   			var url = "${pageContext.request.contextPath}/emp2/bean2json.action";
   			var sendData = null;
			$.post(url,sendData,function(backData){
				//alert(ajax.responseText);
				var hiredate = backData.hiredate;
				var date = new Date(hiredate);
				alert(date.getFullYear()+"年"+(date.getMonth()+1)+"月"+(date.getDate())+"日");
			});		
   		});
   		
   </script>
   
   <!-- list<Emp>转JSON -->	  
   <script type="text/javascript">
   		$(":button:eq(1)").click(function(){
   			var url = "${pageContext.request.contextPath}/emp2/listbean2json.action";
   			var sendData = null;
			$.post(url,sendData,function(backData,textStaut,ajax){
				alert(ajax.responseText);
			});		
   		});

   </script>
   
   
    <!-- map转JSON -->	  
   <script type="text/javascript">
   		$(":button:last").click(function(){
   			var url = "${pageContext.request.contextPath}/emp2/map2json.action";
   			var sendData = null;
			$.post(url,sendData,function(backData,textStaut,ajax){
				alert(ajax.responseText);
			});		
   		});

   </script>
  </body>
</html>









