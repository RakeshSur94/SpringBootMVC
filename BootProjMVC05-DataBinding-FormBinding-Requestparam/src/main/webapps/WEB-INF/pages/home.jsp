<html class="no-js" lang="en">
<head>
    <title> Bootstrap 4 Form Validation with Validator.js Example | positronx.io</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet"></link>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>

    <style>
        body {
            background: #EECDA3;
            background: -webkit-linear-gradient(to top, #EF629F, #EECDA3);
            background: linear-gradient(to top, #EF629F, #EECDA3);
        }

        .container {
            max-width: 550px;
        }

        .has-error label,
        .has-error input,
        .has-error textarea {
            color: red;
            border-color: red;
        }

        .list-unstyled li {
            font-size: 13px;
            padding: 4px 0 0;
            color: red;
        }
    </style>
</head>

<body>
    <div class="container mt-5">
        <div class="card">
            <h5 class="card-header text-center">Emami Employee Form Validation</h5>
            <div class="card-body">
                <form role="form" data-toggle="validator"  action="report" method="POST">
                    <div class="form-group">
                        <label>Id</label>
                        <input type="text" class="form-control" data-error="You must have a name." id="inputName" placeholder="Id" required>

                        <!-- Error -->
                        <div class="help-block with-errors"></div>
                    </div>

                    <div class="form-group">
                        <label>Name</label>
                        <input type="text" class="form-control" data-error="You must have a name." id="inputName" placeholder="Name" required>

                        <!-- Error -->
                        <div class="help-block with-errors"></div>
                    </div>

                    <div class="form-group">
                        <label>Username</label>
                        <input type="text" class="form-control" name="username" maxlength="10" minlength="3"
                            pattern="^[a-zA-Z0-9_.-]*$" id="inputUsername" placeholder="Username" required>

                        <!-- Error -->
                        <div class="help-block with-errors"></div>
                    </div>

                    <div class="form-group">
                        <label>Email</label>
                        <input type="email" class="form-control" id="inputEmail" placeholder="Email" required>

                        <!-- Error -->
                        <div class="help-block with-errors"></div>
                    </div>


                    <div class="form-group">
                        <label>Password</label>
                        <div class="form-group">
                            <input type="password" data-minlength="4" class="form-control" id="inputPassword"
                                data-error="Have atleast 4 characters" placeholder="Password" required />

                            <!-- Error -->
                            <div class="help-block with-errors"></div>
                        </div>
                    </div>

                    <div class="form-group">
                        <label>Confirm Password</label>
                        <div class="form-group">
                            <input type="password" class="form-control" id="inputConfirmPassword"
                                data-match="#inputPassword" data-match-error="Password don't match"
                                placeholder="Confirm" required />

                            <!-- Error -->
                            <div class="help-block with-errors"></div>
                        </div>
                    </div>


                    <div class="form-group">
                        <label>Message</label>
                        <textarea class="form-control" data-error="Please enter message." id="inputMessage"
                            placeholder="Message" required=""></textarea>

                        <!-- Error -->
                        <div class="help-block with-errors"></div>
                    </div>


                    <div class="form-group">
                        <button type="submit" value="send" class="btn btn-primary btn-block">Send</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>

</html>