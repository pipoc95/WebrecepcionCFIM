<%-- 
    Document   : index
    Created on : 17/08/2023, 1:41:05 p. m.
    Author     : Diego A Cuenca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css\estilosRU.css"/>
    </head>
    <body>
        <div class="cuerpo">
            
            <header>
                <img src="img\logocfim.png" id="img1" alt="no carga" width="100%"/><br>
                <img src="img\user.png" id="img2" alt="no carga" width="100%"/>
            </header>
            
            <nav>
                
            </nav>
            
            <section>
                <article>
                    
                    <fieldset>
                        <legend id="leg1">Registrar Usuario CFIM</legend>
                        <form action="$vUsuario" method="POST">
                            
                            <label for="txtCodigo">Identificacion:</label><br>
                            <input type="number" id="txtCodigo" name="Identificacion" ><br>
                            <label for="txtEmail">Email:</label><br>
                            <input type="texto" id="txtEmail" name="Email" ><br>
                            <label for="txtNombre">Nombre:</label><br>
                            <input type="texto" id="txtNombre" name="Nombre" ><br>
                            <label for="txtApellido">Apellido:</label><br>
                            <input type="texto" id="txtApellido" name="Apellido" ><br>
                            <label for="txtFechaContratacion">Fecha Contratacion</label><br>
                            <input type="texto" id="txtFechaContratacion" name="FechaContratacion" ><br>
                            <label for="txtRol">Rol:</label><br>
                            <input type="texto" id="txtRol" name="Rol" ><br><br>
                            
                            <input type="submit" value="Registrar"><br>
                        </form> 
                    </fieldset>
                </article>
                <article>
                    <fieldset>
                        <legend id="leg2">Listar Usuario</legend>
                        <p>Para listar los usuarios registrados presione el siguiente boton</p>
                        
                        <form action="$vUsuario" method="GET">
                         <input type="submit" value="Consultar">   
                      
                        </form>
                    </fieldset>
                </article>
            </section>
            <footer>
                
                <h6>Recepcion CFIM</h6>
            </footer>
        </div>

    </body>
</html>
