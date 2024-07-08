package edu.sdccd.cisc191.template;

//MODULE 1 ARCHITECT ASSIGNMENT

public class StudentArray {
    //array for list of students
    private Student[][] arr;
    public int row;
    public int col;


    //creating 2d array which will contain information of student grade first name and age
    public StudentArray(int row, int col) {
        this.row = row;
        this.col = col;
        arr = new Student[row][col];
    }

    public Student getAtIndex(int row, int col) {
        return arr[row][col];
    }

    public void setAtIndex(int row, int col, Student student) {
        //setting student information at an index
        arr[row][col] = student;
    }

    public int[] findIndexOf(String studentName) {
        //iterating through the row and column and finds if equal row and array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != null && arr[i][j].getFullName().equals(studentName)) {
                    return new int[]{i, j};

                }
            }
        }
        return null;
    }

    public void print() {
        //iterates through student array and prints information
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != null) {
                    System.out.print("\nStudent name: " + arr[i][j].getFullName() + "\nStudent age " + arr[i][j].getAge() + "\nStudent Test Grade: " + arr[i][j].getTestGrade());
                }
            }
        }
    }

    public void deleteAtIndex(int row, int col) {
        arr[row][col] = null; //removing the student data
    }

    public void expandArr(int rows, int cols) {
        //making new array

        if (rows <= arr.length || cols <= arr[0].length) {
            System.out.println("New rows or columns must be larger than current dimensions");
            return;
        }

        Student[][] newArr = new Student[rows][cols];
        //copy existing elements to array
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, newArr[i], 0, arr[i].length);
        }

        row = rows;
        col = cols;
        arr = newArr;
    }

    public void shrinkArr(int rows, int cols) {
        Student[][] newArr = new Student[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(arr[i], 0, newArr[i], 0, cols);
        }
        row = rows;
        col = cols;
        arr = newArr;
    }


}
