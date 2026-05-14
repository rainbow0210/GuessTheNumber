# GuessTheNumber

# Japanese
## 概要

このプロジェクトは、C++で実装されたコマンドラインゲームです。1から10の間のランダムに選ばれた数字を当てるゲームで、プレイヤーがヒントを受け取りながら正解を目指します。

## 使用技術

- 言語: C++
- ライブラリ: iostream、random（標準テンプレートライブラリ）
- その他: コマンドラインインターフェース

## 使い方

### 前提条件

- C++コンパイラ（g++、clang、またはVisual C++など）がインストールされていること
- コマンドラインインターフェース

### インストール方法

```bash
git clone https://github.com/rainbow0210/GuessTheNumber.git
cd GuessTheNumber
g++ -o GuessTheNumber GuessTheNumber.cpp
```

### 基本的な使い方

```bash
./GuessTheNumber
```

プログラムを実行すると、1から10の間の数字を入力してください。正解するまでゲームが続きます。

## 主な機能

- ランダムな数字生成（1-10の範囲）
- ユーザー入力の検証（1-10の範囲外の入力を拒否）
- ヒント機能（入力した数字より大きい/小さい数字を表示）
- 正解判定と完了通知

## 設定

特別な設定ファイルや環境変数は必要ありません。ソースコード内の`uniform_int_distribution<int> hani(1, 10);`の数値を変更することで、ゲーム範囲をカスタマイズできます。

## ライセンス

Unlicense license

# English
## Overview

This project is a command-line game implemented in C++. The objective is to guess a randomly selected number between 1 and 10. Players receive hints to guide them toward the correct answer.

## Technologies Used

- Language: C++
- Libraries: iostream, random (C++ Standard Template Library)
- Other: Command-line interface

## Usage

### Prerequisites

- A C++ compiler installed (g++, clang, Visual C++, or similar)
- Command-line interface

### Installation

```bash
git clone https://github.com/rainbow0210/GuessTheNumber.git
cd GuessTheNumber
g++ -o GuessTheNumber GuessTheNumber.cpp
```

### Basic Usage

```bash
./GuessTheNumber
```

Run the program and enter a number between 1 and 10. The game continues until you guess the correct number.

## Main Features

- Random number generation (range: 1-10)
- User input validation (rejects numbers outside the 1-10 range)
- Hint system (displays whether the target is higher or lower)
- Correct answer detection and completion notification

## Configuration

No configuration files or environment variables are required. To customize the game range, modify the value in the source code at `uniform_int_distribution<int> hani(1, 10);`.

## License

Unlicense license
