void myFunction(int myNumbers[5], char isOdd) {
    for (int i = 0; i < 5; i++) {
        if(isOdd == 'y'){
            printf("%d\n", myNumbers[i]);
        }
    }
}

int main() {
    int myNumbers[5] = {10, 20, 30, 40, 50};
    myFunction(myNumbers);
    return 0;
}
