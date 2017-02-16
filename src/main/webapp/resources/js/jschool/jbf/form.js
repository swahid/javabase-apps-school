


jbf.form||(function(e){
    var form = {
    		
        validate	: function(id){
        	var status;
        	javascript: $(id).validationEngine('attach');
			if ($(id).validationEngine('validate')) {
				status= true;
			}else {
				status= false;
			}
			return status;
        }
    };
    e.form = form;
}(jbf));
