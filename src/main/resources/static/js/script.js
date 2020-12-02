

var listaCategorias = []

$('#btnInsertarCategoria').click(function (e) { 
    let data = {}
    data.nombreCategoria = $('#inputInsertarCategoria').val();
    

    $.ajax({
        type: "post",
        contentType: "application/json",
        url: "/admin/categorias/crear",
        data: JSON.stringify(data),
        success: function (response) {
            console.log(response);
            if( response == true){
                alert('La categoria se agregó correctamente')
                location.reload();
            }
                
        }
    });
});

$('.btnEnviarEditarCategoria').click(function (e) {
    let data = {}
    data.nombreCategoria = $(this).siblings(".inputNombrecategoria").val();
    data.idCategoria = $(this).siblings(".inputIdCategoria").val();


    $.ajax({
        type: "post",
        contentType: "application/json",
        url: "/admin/categorias/editar",
        data: JSON.stringify(data),
        success: function (response) {
            console.log(response);
            if( response == true){
                alert('La categoria se modificó correctamente')
                location.reload();
            }

        }
    });
});


$('.btnEliminaCategoria').click(function (e) {
    let data = {}
    data.idCategoria = $(this).siblings(".inputIdCategoria").val();

    $.ajax({
        type: "DELETE",
        contentType: "application/json",
        url: "/admin/categorias/eliminar/" + data.idCategoria,
//        data: JSON.stringify(data),
        success: function (response) {
            console.log(response);
            if( response == true){
                alert('La categoria se eliminó correctamente')
                location.reload();
            }

        }
    });
});


$('#agrega-categoria').click(function(e){

    e.preventDefault();
    $('#agrega-categoria-seccion').append('<div class="form-group"><div class="alert alert-primary alert-dismissible fade show mx-1" role="alert"'+ 'value=' + $('select[name="idCategoria"] option:selected').val() +'>' +
    $('select[name="idCategoria"] option:selected').text() +
    '<button type="button" class="close" data-dismiss="alert" aria-label="Close">' +
    '  <span aria-hidden="true">&times;</span>' + 
    '</button>' +
  '</div></div>');
  listaCategorias.push($('select[name="idCategoria"] option:selected').val())
});
