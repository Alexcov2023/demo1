package lesson11.homeWork.serch;

public class BinarSearchCode {

    public int indexOfSearch(int[] arrayForSearch, int searchElement){

        int indexOfSearch = -1;
        int minIndex = 0;
        int maxIndex = arrayForSearch.length;

    while (minIndex < maxIndex) {
        int midlIndex = minIndex + ((maxIndex - minIndex) / 2);
        if (arrayForSearch[midlIndex] < searchElement) {
            minIndex = midlIndex + 1;
        } else if (arrayForSearch[midlIndex] > searchElement) {
            maxIndex = midlIndex - 1;
        } else if (arrayForSearch[midlIndex] == searchElement) {
            indexOfSearch = midlIndex;
            break;
        }
    }
    return indexOfSearch;

    }

}
