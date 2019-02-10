package com.test.calculator;

public class Calculator {

    private String number = "";
    private String result = "0";
    private String ope = "";

    public String display(){ return number.isEmpty() ? result : number;
    }

    public void pushAdd(){
        pushEqu();
        ope = "+";
    }

    public void pushSub(){
        pushEqu();
        ope = "-";
    }

    public void pushMul(){
        pushEqu();
        ope = "*";
    }

    public void pushDiv(){
        pushEqu();
        ope = "/";
    }


    public void pushEqu(){
        double n = Double.parseDouble(result);
            if( !(number.equals(""))){
                if ( ope.equals("+") ){
                    n += Double.parseDouble(number);
                }else if( ope.equals("-")){
                    n -= Double.parseDouble(number);
                }else if( ope.equals("*")){
                    n *= Double.parseDouble(number);
                }else if( ope.equals("/")){
                    n /= Double.parseDouble(number);
                }else{
                    n = Double.parseDouble(number);
                }
            }



        if ( n == (int)n){
            result = String.format("%d", (int)n);

        }else{
            result = String.format("%s",n);

        }
        number = "";
        ope = "";

    }

    public void pushAc(){
        number = "";
        result = "0";
        ope = "";
    }

    public void pushDot(){
        if( number.equals("") ){
            number = "0.";
        }else if( number.equals("0.") ){

        }
        else{
            number = number + ".";
        }
    }
    public void pushZeo(){
        if ( number.equals("0") || number.equals("")){

        }else {
            number = number + "0";
        }
    }
    public void pushOne(){
        number = number + "1";
    }
    public void pushTwo(){
        number = number + "2";
    }
    public void pushThree(){
        number = number + "3";
    }
    public void pushFour(){
        number = number + "4";
    }
    public void pushFive(){
        number = number + "5";
    }
    public void pushSix(){
        number = number + "6";
    }
    public void pushSeven(){
        number = number + "7";
    }
    public void pushEight(){
        number = number + "8";
    }
    public void pushNine(){
        number = number + "9";
    }
}
