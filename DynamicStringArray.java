import java.util.Locale;

public class DynamicStringArray {

    private String[] stringArray;


    public DynamicStringArray() {
        stringArray = new String[0];
    }

    public DynamicStringArray(int size) {
        stringArray = new String[size];
        for (int i = 0; i < size; i++) {
            stringArray[i] = new String();
        }
    }


    public DynamicStringArray(String string) {
        stringArray = new String[1];
        stringArray[0] = string;

    }

    private DynamicStringArray copyArray() {
        DynamicStringArray copyArray = new DynamicStringArray();
        for (int i = 0; i < stringArray.length; i++) {
            copyArray.add(stringArray[i]);
        }
        return copyArray;
    }


    public void add(String string) {
        if (stringArray.length == 0) {
            stringArray = new String[1];
            stringArray[0] = string;
        } else {
            String[] tempArray = new String[stringArray.length + 1];
            for (int i = 0; i < stringArray.length; i++) {
                tempArray[i] = stringArray[i];
            }
            tempArray[stringArray.length] = string;
            stringArray = tempArray;
        }
    }

    public void insertString(String string, int index) {
        String[] tempArray = new String[stringArray.length + 1];
        int j = 0;
        for (int i = 0; i < stringArray.length + 1; i++) {
            if (i == index) {
                tempArray[i] = string;
                i++;
            }
            tempArray[i] = stringArray[j];
            j++;
        }
        stringArray = tempArray;
    }

    public int size() {
        return stringArray.length;
    }

    public void remove(int index) {
        String[] tempArray = new String[stringArray.length - 1];
        int j = 0;
        for (int i = 0; i < stringArray.length - 1; i++) {
            if (i == index) {
                j++;
            }
            tempArray[i] = stringArray[j];
            j++;
        }
        stringArray = tempArray;
    }

    public void remove(String string) {
        String[] tempArray = new String[stringArray.length - 1];
        int j = 0;
        for (int i = 0; i < stringArray.length - 1; i++) {
            if (stringArray[i].equals(string)) {
                j++;
            }
            tempArray[i] = stringArray[j];
            j++;
        }
        stringArray = tempArray;
    }

    public void removeOll(String[] strings) {
        String[] tempArray = new String[stringArray.length];
        int index = 0;
        for (int i = 0; i < stringArray.length; i++) {
            boolean flag = false;
            for (int j = 0; j < strings.length; j++) {
                if (stringArray[i].equals(strings[j])) {
                    i++;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            tempArray[index] = stringArray[i];
            index++;
        }
        stringArray = new String[0];
        int i = 0;
        while (tempArray[i] != null) {
            this.add(tempArray[i]);
            i++;
        }
    }

    public void replace(String string1, String string2) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(string1)) {
                stringArray[i] = string2;
            }

        }
    }

    public String getElement(int index) {
        return stringArray[index];
    }

    public int indexoff(String string) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(string)) {
                return i;
            }
        }
        return -1;
    }

    public int coutofString(String string) {
        int cout = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(string)) {
                cout++;
            }
        }
        return cout;
    }

    public int lastindexoff(String string) {
        int index = -1;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(string)) {
                index = i;
            }
        }
        return index;
    }

    public void printArray() {
        for (int i = 0; i < this.stringArray.length; i++) {
            System.out.print(this.stringArray[i] + "  ");
        }
        System.out.println();
    }

    public void sortASC() {
        int lenght = stringArray.length;
        String[] temp = new String[lenght];
        for (int i = 0; i < lenght; i++) {
            String min = stringArray[0];
            int index = 0;
            for (int j = 1; j < stringArray.length; j++) {
                if (min.toLowerCase(Locale.ROOT).compareTo(stringArray[j].toLowerCase(Locale.ROOT)) > 0) {
                    min = stringArray[j];
                    index = j;
                }
            }
            temp[i]=stringArray[index];
            this.remove(index);
            if (stringArray.length<2){
                temp[temp.length-1]=stringArray[0];
                break;
            }
        }
      //  stringArray= new String[temp.length];
        stringArray=temp;
    }
    public void sortDESC() {
        int lenght = stringArray.length;
        String[] temp = new String[lenght];
        for (int i = 0; i < lenght; i++) {
            String max = stringArray[0];
            int index = 0;
            for (int j = 1; j < stringArray.length; j++) {
                if (max.toLowerCase(Locale.ROOT).compareTo(stringArray[j].toLowerCase(Locale.ROOT)) < 0) {
                    max = stringArray[j];
                    index = j;
                }
            }
            temp[i]=stringArray[index];
            this.remove(index);
            if (stringArray.length<2){
                temp[temp.length-1]=stringArray[0];
                break;
            }
        }
        //  stringArray= new String[temp.length];
        stringArray=temp;
    }
    public void swap(int index,int index1){
        String tempstring= stringArray[index];
        stringArray[index]=stringArray[index1];
        stringArray[index1]=tempstring;
    }
}
