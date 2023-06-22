package com.example.project;

public class Cube {
static String[][] Face = {
            {"0", "1", "2"},
            {"3", "4", "5"},
            {"6", "7", "8"}
    };

    static String[][][] theCUBE = {
            {
                    {"0R", "1R", "2R"},
                    {"3R", "4R", "5R"},
                    {"6R", "7R", "8R"}
            },
            {
                    {"0B", "1B", "2B"},
                    {"3B", "4B", "5B"},
                    {"6B", "7B", "8B"}
            },
            {
                    {"0Y", "1Y", "2Y"},
                    {"3Y", "4Y", "5Y"},
                    {"6Y", "7Y", "8Y"}
            },
            {
                    {"0G", "1G", "2G"},
                    {"3G", "4G", "5G"},
                    {"6G", "7G", "8G"}
            },
            {
                    {"0W", "1W", "2W"},
                    {"3W", "4W", "5W"},
                    {"6W", "7W", "8W"}
            },
            {
                    {"0o", "1o", "2o"},
                    {"3o", "4o", "5o"},
                    {"6o", "7o", "8o"}
            }


    };

    static void showFace(String[][] face){

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(face[i][j]);
            }
            System.out.println();
        }
    }

    static void rotateFace(String[][] face, boolean clockwise){

        String[][] tempFace = new String[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tempFace[i][j] = face[i][j];
            }
        }

        if(!clockwise){
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    face[i][j] = tempFace[j][i];
                }
            }

            String[] tempRow = new String[3];

            for(int i = 0; i < 3; i++){
                tempRow[i] = face[0][i];
            }
            face[0] = face[2];
            face[2] = tempRow;
        }

        else{
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    face[i][j] = tempFace[j][i];
                }
            }
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    tempFace[i][j] = face[i][j];
                }
            }
            for(int i = 0; i < 3; i++){
                face[i][0] = face[i][2];
            }
            for(int i = 0; i < 3; i++){
                face[i][2] = tempFace[i][0];
            }




        }



    }
    public static void main(String[] args){

        showFace(Face);
        System.out.println();

        rotateFace(Face, true);
        System.out.println();

        showFace(Face);

        rotateFace(Face, false);
        System.out.println();

        showFace(Face);



    }

}

