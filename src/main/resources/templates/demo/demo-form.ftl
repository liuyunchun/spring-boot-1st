<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<h1>GET Demo</h1>
<form action="/user-show" method="get">
    名稱<input name="name"/><br/>
    年紀<input name="age"/>
    <button>按我</button>
</form>
<h1>POST Demo</h1>
<form action="/user-show" method="post">
    名稱<input name="name"/><br/>
    年紀<input name="age"/>
    <button>按我</button>
</form>
<h1>Insert Demo</h1>
<form action="/user-insert" method="post">
    名稱<input name="name"/><br/>
    年紀<input name="age"/>
    <button>按我</button>
</form>
<h1>Update Demo</h1>
<form action="/user-update" method="post">
    名稱<input name="name"/><br/>
    年紀<input name="age"/>
    <button>按我</button>
</form>
<h1>Find Demo</h1>
<form action="/user-find" method="get">
    名稱<input name="name"/><br/>
    <button>按我</button>
</form>
<h1>Delete Demo</h1>
<form action="/user-delete" method="get">
    名稱<input name="name"/><br/>
    <button>按我</button>
</form>
<script src="/js/main.js"></script>
</body>
</html>