<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1> Cadastro de Hospedagem </h1>
        <form method="post">
            Nome*:     <input type="text" name="nome" id="nome" /><br><br>         
            Email*:    <input type="text" name="email" id="email"  /><br><br>
            Endereço*:    <input type="text" name="endereco" id="endereco" /><br><br>
            Telefone: <input type="text" name="telefone" id="telefone" /><br><br>
            Tipo de Cargo: <select name="cargo" id="cargo">
                                <option value="docente">Docente</option>
                                <option value="estudante">Estudante</option>
                                <option value="tae">TAE</option>
                                <option value="terceirizado">Terceirizado</option>
                            </select><br><br>
                            <button type="submit" value="Enviar"> Salvar </button>
        </form>
    </body>
</html>
