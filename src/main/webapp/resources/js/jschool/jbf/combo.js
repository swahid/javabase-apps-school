/*
 * this file used to make comboialization preLoad combo method call dynamic;
 */

jbf.combo||(function(e){
    var combo = {
    		
		loadClass: function(id, url, param) {
			var data = jbf.ajax.load(url, param);
			$(id).empty();
			for (var i = 0; i < data.length; i++) {
				$(id).append("<option value=''></option>")
				$(id).append("<option value="+ data[i].classId +">"+data[i].className+"</option>")
			}
		},
    loadRole: function(id, url, param) {
    	var data = jbf.ajax.load(url, param);
    	$(id).empty();
    	for (var i = 0; i < data.length; i++) {
    		$(id).append("<option value=''></option>")
    		$(id).append("<option value="+ data[i].roleId +">"+data[i].displayName+"</option>")
    	}
    },
	loadBuilding: function(id, url, param) {
			var data = jbf.ajax.load(url, param);
			$(id).empty();
			for (var i = 0; i < data.length; i++) {
				$(id).append("<option value=''></option>")
				$(id).append("<option value="+ data[i].buildingId +">"+data[i].buildName+"</option>")
			}
		},
    loadRoomUsed: function(id, url, param) {
    	var data = jbf.ajax.load(url, param);
    	$(id).empty();
    	for (var i = 0; i < data.length; i++) {
    		$(id).append("<option value=''></option>")
    		$(id).append("<option value="+ data[i].roomUsedId +">"+data[i].usedName+"</option>")
    	}
    }
    };
    e.combo = combo;
}(jbf));