


jbf.form||(function(e){
    var form = {
    		
        validate	: function(id){
        	javascript: $(id).validationEngine('attach');
			if (!$(id).validationEngine('validate')) {
				return true;
			}else {
				return false;
			}
			return true;
        }
    };
    e.form = form;
}(jbf));
