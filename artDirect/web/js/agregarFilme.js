$(document).ready(function(){
    $('.opcion').on('change',function(){
        if($(this).hasClass('peli')){
            $('.formularioAgregar').attr('enctype', 'multipart/form-data');
            $('.formularioAgregar').attr('action', '/artDirect/agregarFilmeServlet');
            $('.puroCartelDeSantaALV').html('<input type="file" name="archivo" class="agregarNuevo" required>');
        }
        else{
            $('.formularioAgregar').attr('enctype', 'application/x-www-form-urlencoded');
            $('.formularioAgregar').attr('action', 'agregarEpisodio.jsp');
            $('.puroCartelDeSantaALV').html('');
        }
    });
    
    $('.btnBorrar').click(function(event){
        var p = $(this).parent();
        event.preventDefault();
        if (confirm("Seguro que quieres eliminar este filme, esta acción no puede desacerse.") === true) {
           p.submit();
        }
    });
});