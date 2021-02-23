var pez = null;
var peces = null;

function cargarVerPeces() {
    $.ajax(
            {
                type: "GET",
                url: "html/peces/mostrar.html",
                async: true
            }
    ).done(function (data)
    {
        mostrarPeces();
        $('#principal').html(data);
    });
}

function mostrarPeces() {
    $.ajax(
            {
                type: "GET",
                asyc: true,
                url: "api/peces/getAll"
            }
    ).done(function (data) {
        pez = data;
        var tabla = "<table class='table table-dark table-striped' id='tabla'>";
        tabla += "<tr>\n\
                <th>Nombre:</th>\n\
                <th>Especie:</th>\n\
                <th>Precio:</th>\n\
                <th>Calificacion:</th>\n\
                <th>Foto:</th>\n\
                </tr>";
        for (var i = 0; i < data.length; i++) {
            tabla += "<tr scope=row>";
            tabla += "<td>" + data[i].peces.nombre + "</td>";
            tabla += "<td>" + data[i].peces.especie + "</td>";
            tabla += "<td>" + data[i].peces.precio + "</td>";
            tabla += "<td>" + data[i].peces.calificacion + "</td>";
            tabla += '<td> <img id="imgAfiliado" height="70px" width="70px"'> + data[i].peces.foto + '</td>';
            tabla += "</tr>";
        }
        tabla += "</table>";
        $('#tbPeces').html(tabla);
    });
}