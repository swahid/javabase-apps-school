jbf.date||(function($){
    var date = {
        $package            : 'Msc',
        $class              : 'Msc.date',
        show                : 'd-m-Y',
        write               : 'Y-m-d\\TH:i:s',
        getHijri            : function(gregorianDate){
            /*var prefix     = associationKey.charAt(0).toUpperCase(),
            suffix         = associationKey.substring(1),
            associatedName = prefix + suffix;
            return associatedName;*/
        },
        getGregorian          : function(hijriDate){
            /*var associatedName  = data.getAssociationName(associationKey),
            association         = {
                model           : $.app.getAbsModel(model),
                associatedName  : associatedName,
                associationKey  : associationKey,
                primaryKey      : primaryKey,
                foreignKey      : foreignKey,
                reader          : $.proxy.getReader()
            };
            return association;*/
        }
    };
    $.date = date;
}(jbf));
