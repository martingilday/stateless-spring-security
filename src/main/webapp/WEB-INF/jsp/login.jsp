<!DOCTYPE html>
<html>

<head>
    <title>Login</title>
    <link href="/css/bootstrap.css" rel="stylesheet" />
</head>

<body>

    <div class="container">
        <h1>Login</h1>
        <form method="post" action="/j_spring_security_check" class="well">

            <label for="username">Username</label>
            <input id="username" name="j_username" type="text" value="martin" />

            <label for="password">Password</label>
            <input id="password" name="j_password" type="password" value="password" />

            <label class="checkbox">
                <input type="checkbox" name="_spring_security_remember_me" checked="checked">Remember me</input>
            </label>
            
            <button type="submit" class="btn btn-primary">Login</button>

        </form>
    </div>
</body>
</html>