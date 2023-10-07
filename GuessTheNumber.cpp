#include <iostream>
#include <random>
using namespace std;

int main(){
    //標準テンプレートライブラリ<random>使用箇所
    random_device rand;
    default_random_engine engine(rand());
    uniform_int_distribution<int> hani(1, 10);

    int seikai = hani(engine);

    int kaitou = 0;
    while(seikai != kaitou){
        cout << "答えを入力してください：";
        cin >> kaitou;
        
        if(kaitou > 10 || kaitou <= 0){
            cout << "1から10の間の数を入力してください。\n";
        }
        else if(kaitou == seikai){
            cout << "正解です！\n";
        }
        else if(kaitou < seikai){
            cout << "もう少し大きい数です！\n";
        }
        else{
            cout << "もう少し小さい数です！\n";
        }
    }

    return 0;
}