AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(this);

        //this code for inflater
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.activity_questions, null);
        alertDialogBuilder.setView(dialogView);

        //alertDialogBuilder.setTitle("Your Details");

        //alertDialogBuilder.setMessage("hello world");

        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id) {

                showpage(null);

            }

        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {


            public void onClick(DialogInterface dialog, int id) {

                dialog.cancel();
            }


        });

        AlertDialog alertdialog = alertDialogBuilder.create();

        alertdialog.show();
