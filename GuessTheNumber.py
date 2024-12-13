import random

def main():
    # ランダムな正解の生成
    seikai = random.randint(1, 10)

    kaitou = 0
    while seikai != kaitou:
        try:
            kaitou = int(input("答えを入力してください："))
        except ValueError:
            print("数値を入力してください。")
            continue
        
        if kaitou > 10 or kaitou <= 0:
            print("1から10の間の数を入力してください。\n")
        elif kaitou == seikai:
            print("正解です！\n")
        elif kaitou < seikai:
            print("もう少し大きい数です！\n")
        else:
            print("もう少し小さい数です！\n")

if __name__ == "__main__":
    main()
