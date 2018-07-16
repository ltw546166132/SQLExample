$(document).ready(
    function(){
        $("#province").change(
            function(){             
                var pidvalue = $(this).val();
                if(pidvalue==""){
                    // $("#city").html("<option>--请选择--</option>")
                    return;
                }
                $.post("CityList", {pid:pidvalue}, function(data){
                    $("#city").html("<option value = ''>--请选择--</option>");
                    $(data).find("city").each(
                        function(){
                            var id = $(this).children("id").text();
                            var pname = $(this).children("pname").text();
                            $("#city").append("<option value = '"+id+"'>"+pname+"</option>");
                        }
                    );
                })
            }
        )
    }
)