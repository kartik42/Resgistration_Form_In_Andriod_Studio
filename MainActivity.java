package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    
    String Colector="",Col="";

    TextView Space1,Space2,Space3,Space4,Space5,Space6,Space7,Space8,Space9,Space10,Space11;
    EditText FirstName,LastName,Marks,Markss,Stream,FatherName,MotherName,City,MobileNumber,Comment;
    Button SubmitSave;
    RadioGroup rg1, rg2;
    RadioButton rd1,rd2, Cgpatbn,Percentbtn,Malebtn,Femalbtn,Otherbtn;
    CheckBox c,java,python;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstName=findViewById(R.id.firstName);
        Space1=findViewById(R.id.space1);
        LastName=findViewById(R.id.lastName);
        Space2=findViewById(R.id.space2);
        rg1=findViewById(R.id.Rg1);
        Cgpatbn=findViewById(R.id.Cgpa);
        Percentbtn=findViewById(R.id.Percent);
        Space3=findViewById(R.id.space3);
        Marks=findViewById(R.id.marks);
        Space4=findViewById(R.id.space4);
        Markss=findViewById(R.id.markss);
        Space5=findViewById(R.id.space5);
        Stream=findViewById(R.id.steam);
        Space6=findViewById(R.id.space6);
        FatherName=findViewById(R.id.fatherName);
        Space7=findViewById(R.id.space7);
        MotherName=findViewById(R.id.motherName);
        Space8=findViewById(R.id.space8);
        City=findViewById(R.id.city);
        Space9=findViewById(R.id.space9);
        MobileNumber=findViewById(R.id.mobileno);
        Space10=findViewById(R.id.space10);
        rg2=findViewById(R.id.Rg2);
        Malebtn =findViewById(R.id.Male);
        Femalbtn=findViewById(R.id.Female);
        Otherbtn=findViewById(R.id.Other);
        c=findViewById(R.id.C);
        java=findViewById(R.id.JAVA);
        python=findViewById(R.id.PYTHON);
        Comment=findViewById(R.id.comment);
        Space11=findViewById(R.id.space11);
        SubmitSave=findViewById(R.id.btnSubmit);
        SubmitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = FirstName.getText().toString();
                String lname=LastName.getText().toString();
                String marks1=Marks.getText().toString();
                String marks2=Markss.getText().toString();
                String stream=Stream.getText().toString();
                String faname=FatherName.getText().toString();
                String maname=MotherName.getText().toString();
                String city=City.getText().toString();
                String contact=MobileNumber.getText().toString();
                String comment=Comment.getText().toString();
                if (fname.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the First Name field",Toast.LENGTH_SHORT).show();
                }
                else if(lname.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the  Last Name field",Toast.LENGTH_SHORT).show();
                }
                else if (fname.equals("kartik") || fname.equals("Kartik") || fname.equals("KARTIK") || lname.equals("raj") || lname.equals("Raj") || lname.equals("RAJ")) {
                    invalid = true;
                    Space2.setText("Name Already exist");
                    Space11.setText("ERROR");
                }
                
               


                else if(marks1.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the 10th marks field",Toast.LENGTH_SHORT).show();
                }
                else if(marks2.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the 12th marks field",Toast.LENGTH_SHORT).show();
                }


                else if(stream.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the Stream field",Toast.LENGTH_SHORT).show();
                }
                else if(faname.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the father Name field",Toast.LENGTH_SHORT).show();
                }
                else if(maname.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the Mother Name field",Toast.LENGTH_SHORT).show();
                }
                else if(city.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the City field",Toast.LENGTH_SHORT).show();
                }
                else if (contact.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the Mobile Number field",Toast.LENGTH_SHORT).show();
                }

                else if (comment.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill the Comment field",Toast.LENGTH_SHORT).show();
                }



                else{

                    Colector+="First name: "+fname+"\n";
                    Colector+="Last name: "+lname+"\n";
                    int rad = rg1.getCheckedRadioButtonId();

                    rd1 = (RadioButton)findViewById(rad);
                    String mod = "";

                    if (rad == -1) {
                        Toast.makeText(getApplicationContext(),"any field is empty",Toast.LENGTH_LONG).show();
                        return;
                    }
                    else {
                        Col += rd1.getText().toString();
                    }

                    Colector+="10th marks: "+marks1+Col+"\n";
                    Colector+="12th marks: "+marks2+Col+"\n";
                    Colector+="Stream: "+stream+"\n";
                    Colector+="Father's name: "+faname+"\n";
                    Colector+="Mother's name: "+maname+"\n";
                    Colector+="City: "+city+"\n";
                    Colector+="Mobile Number: "+contact+"\n";



                    int rad1 = rg2.getCheckedRadioButtonId();

                    rd2 = (RadioButton)findViewById(rad1);
                    String gen = "";

                    if (rad1 == -1) {
                        Toast.makeText(getApplicationContext(),"any field is empty",Toast.LENGTH_LONG).show();
                        return;
                    }
                    else {
                        Colector += "Gender: "+rd2.getText().toString()+"\n";
                    }



                    Colector+="Skills:"+"\n";
                    if (c.isChecked()){
                        Colector+="\t\t\t\t\t"+"C"+"\n";}
                        if (java.isChecked()){
                            Colector+="\t\t\t\t\t"+"JAVA"+"\n";
                        }
                        if (python.isChecked()){
                            Colector+="\t\t\t\t\t"+"PYTHON"+"\n";
                        }

                    Colector+="Comment: "+comment+"\n";
                    Toast.makeText(MainActivity.this,"User Info \n:"+Colector,Toast.LENGTH_SHORT).show();
                }
                Colector=" ";
                Col=" ";

            }
        });




    }
}
