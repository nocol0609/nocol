/**
 * 
 */

var tool = new ArrayTools();

function ArrayTools() {

	// 定义找导数组最大值的方法
	this.getMax = function(arr) {
		var max = arr[0];
		for (var i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	// 定义找到哦对象元素索引的方法
	this.getIndex = function(arr, target) {
		for (var i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}