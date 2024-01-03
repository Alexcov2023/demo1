package lesson11.lessoncode.sort.sort;

public class ArraySortStudent {

    public void bubbleSortName(Student[] workingArray){
        boolean notSorted = true;
        Student temp;

        while (notSorted) {

            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                String currentStudentName =  workingArray[i].getName();
                String nextStudentName =  workingArray[i+1].getName();

                if (currentStudentName.compareTo(nextStudentName) > 0) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;

                }
            }
        }

    }

    public void bubbleSortGroup(Student[] workingArray){
        boolean notSorted = true;
        Student temp;

        while (notSorted) {

            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                String currentStudentGroup =  workingArray[i].getGroup();
                String nextStudentGroup =  workingArray[i+1].getGroup();

                if (currentStudentGroup.compareTo(nextStudentGroup) > 0) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;

                }
            }
        }

    }

    public void bubbleSortById(Student[] workingArray){
        boolean notSorted = true;
        Student temp;

        while (notSorted) {

            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                int currentStudentId =  workingArray[i].getId();
                int nextStudentId =  workingArray[i+1].getId();

                if (currentStudentId > nextStudentId) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;

                }
            }
        }
    }

    // немного упрощенный код пузырьковой сортировки
    public void bubbleSortNameSimpl(Student[] workingArray){
        boolean notSorted = true;

        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                if (workingArray[i].getName().compareTo(workingArray[i + 1].getName()) > 0) {
                    Student temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;
                }
            }
        }
    }

    //другой код пузырьковой сортировки по ID
    public void bubbleSortByIdOth (Student[] workingArray) {
        for (int i = 0; i < workingArray.length - 1; i++) {
            for (int j = 0; j < workingArray.length - 1; j++) {
                if (workingArray[j].getId() > workingArray[j+1].getId()) {
                    Student tmp = workingArray[j];
                    workingArray[j] = workingArray[j+1];
                    workingArray[j+1] = tmp;
                }
            }
        }
    }

    // другой код сортировки по имени
    public void bubbleSortNameOther(Student[] workingArray) {
        for (int i = 0; i < workingArray.length - 1; i++) {
            for (int j = workingArray.length - 1; j > i; j--) {
                if (workingArray[j - 1].getName().compareTo(workingArray[j].getName()) >0) {
                    Student tmp = workingArray[j - 1];
                    workingArray[j - 1] = workingArray[j];
                    workingArray[j] = tmp;
                }

            }
        }
    }


}
