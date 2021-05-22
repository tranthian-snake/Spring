<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-9 col-md-12">
            <div class="card card-small">
                <div class="card-body">
                    <form class="add-new-post" method="post" action="index">
                        <input class="form-control" type="text" placeholder="Name Employees" name="name">
                        <input class="form-control" type="number" placeholder="Wage" name="wage">
                        <input class="btn btn-primary" style="float: right" type="submit" value="Submit">

                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
