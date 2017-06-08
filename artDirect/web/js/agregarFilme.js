$(document).ready(function(){
    $('.opcion').on('change',function(){
        if($(this).hasClass('peli')){
            $('.formularioAgregar').attr('enctype', 'multipart/form-data');
            $('.formularioAgregar').attr('action', '/artDirect/agregarFilmeServlet');
            $('.puroCartelDeSantaALV').html('<label class="control-label">Archivo del filme</label><input type="file" name="archivo" class="form-control agregarNuevo" required>');
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
    
    $('.agregarActor').click(function(){
        $('.reparto').append('<div class="persona-reparto"><input type="text" name="persona" placeholder="Nombre" class="form-control persona-clase p1 enlinea" required><button class="btn btn-default p2" onclick="quitarActor(this);">Quitar</button><input type="text" name="papel" placeholder="Rol" class="form-control persona-clase2 p2 enlinea" required></div>');
    });
    
    $('.miraCategoria').click(function(){
        $('.categorias').toggleClass('oculto');
        $(this).toggleClass('glyphicon-plus-sign');
        $(this).toggleClass('glyphicon-minus-sign');
    });
    
    $('.agregando').click(function(event){
        event.preventDefault();
        if(confirm('¿Estas seguro? Las películas y series no pueden ser modificadas después de ser creadas.') === true){
            $('.formularioAgregar').submit();
        }
    });
    
});

function quitarActor(elemento){
    $(elemento).parent().remove();
}

function agregarCategoria(elemento){
    $(elemento).children('.categoriaO').attr('name', 'catAgregada');
    var cat = $(elemento).html();
    var etiqueta = '<span class="label label-primary ePum"><span class="etiqueta-valor">' + cat + '</span> <span class="glyphicon glyphicon-remove-sign" style="vertical-align: initial;" onclick="quitarCategoria(this)"></span></span>';
    
    $(elemento).remove();
    $('.categorias-contenedor').append(etiqueta);
}

function quitarCategoria(elemento){
    $(elemento).parent().children('.categoriaO').attr('name', 'categoriasOculto');
    var cat = $(elemento).siblings('.etiqueta-valor').html();
    var etiqueta = '<div class="categorias-elemento" onclick="agregarCategoria(this);">' + cat + '</div>';
    
    $(elemento).parent().remove();
    $('.categorias').append(etiqueta);
}












