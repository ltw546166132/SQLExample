$(document).ready(
    function(){
        $("#province").change(
            function(){
                var pidvalue = $("#province").val();
                if(pidvalue==""){
                    return;
                }
                $.post("CityJson", {pid:pidvalue}, function(data){
                    $("#city").html("<option value = ''>--请选择--</option>");
                    $(data).each(function(index,s){
                    	console.log(s);
                        var id = s.id;
                        var pname = s.pname;
                        $("#city").append("<option value = '"+id+"'>"+pname+"</option>");
                    });
                }, "json");
            }
        );
    }
);