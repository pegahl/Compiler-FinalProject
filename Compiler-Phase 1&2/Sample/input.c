void func1(int myNumbers[5], char isOdd) {
    for (int i = 0; i < 5; i++) {
        if(isOdd == 'y'){
            printf("%d\n", myNumbers[i]);
        }
    }
}
int func2(int b, char flag, int a) {
        for (int i = 0; i < 2; i++) {
            a=b+a;
        }
    return a;
}

int func3(int a3, int b3, int c3) {
    func1(a3);
    return c3;
}

int main() {
    int myNumbers[5] = {10, 20, 30, 40, 50};
    int newN[1]={0};
    func1(myNumbers,c);
    return 0;
}
