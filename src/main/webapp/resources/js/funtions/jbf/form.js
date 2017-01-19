jbf.form||(function($){
    var form = {
        $package            : 'Msc',
        $class              : 'Msc.form',
        show                : 'd-m-Y',
        write               : 'Y-m-d\\TH:i:s',
        
        validate	: function(id){
        	javascript: $(id).validationEngine('attach');
			if (!$(id).validationEngine('validate')) {
				return;
			}
        }
    };
    $.form = form;
}(jbf));
