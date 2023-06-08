<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="">
        <label for="" style="color: blueviolet;">Student Id</label>
        <input type="text" name="sid" placeholder="Student Id" > <br>
        <label for="" style="color: aqua;">Student Name</label>
        <input type="text" name="sname" placeholder="Student Name"><br>
        <label for="" style="color: blue;">Email</label>
        <input type="text" name="email" placeholder="Email"><br>
        <label for="" style="color: brown;">Phone Number</label>
        <input type="text" name="phono" placeholder="Phone Number"> <br>
        <input type="submit">
    </form>
    <h1>please Enter Id for Details</h1>
    <form action="showStudent">
        <label for="">Student Id</label>
        <input type="text" name="sid"> <br>
        <input type="submit">
    </form>

    <h1>please Enter Id for Deletion</h1>
    <form action="deleteStudent">
        <label for="">Student Id</label>
        <input type="text" name="sid"> <br>
        <button>Deletes</button>
    </form>
</body>
</html>