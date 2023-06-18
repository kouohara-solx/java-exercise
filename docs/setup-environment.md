# 実習環境のセットアップ

本書ではJavaプログラミング演習用の環境設定方法を記述します。

## 前提条件

- インターネットに接続可能なWindowsPC
- 取得済みGitHubアカウント

## GitHub Codespaces Java Templateの導入

1) PCにログインし、Webブラウザを開きます。
2) Microsoft提供の[Java Templateリポジトリ](https://github.com/microsoft/vscode-remote-try-java)に接続します。
3) 右上緑の「Use this template」をクリックし、表示された「Open in a codespace」をクリックします。

   ![Open in a codespace](img/open_in_a_codespaces.png)

4) codespaceのセットアップが開始されます。

   ![Settingup](img/Setting_up_your_codespace.png)

5) セットアップが完了すると、VS Codeが表示されます。

   ![Vs Code](img/vs_code.png)

## VS Codeの設定

1) 右下にいくつかポップアップが表示されます。それぞれ「Accept」「インストール」を押下します。

   ![popup](img/popup.png)

2) 左上Explorerボタンをクリックして、エクスプローラーを表示します。

   ![Explorer button](img/Explorer_button.png)

3) .vscodeフォルダーをクリックし、さらにlaunch.jsonをクリックして、開きます。

   ![open launch.json](img/open_launch_json.png)

4) 「console」を「integratedTerminal」に書き換えます。

   ![rewite launch.json](img/edit_launch_json.png)

5) キーボードの「ctrl」＋「s」を押下、または右上のメニューから「ファイル」「保存」をクリックして、保存します。

   ![save launch json](img/save_launch_json.png)

## 起動確認（Hello Remote World!）

1) 右側エクスプローラーでsrcフォルダー、main/java/com/mycompany/appフォルダー、App.javaの順にクリックし、ファイルを開きます。

   ![open app.java](img/open_app_java.png)

2) 右上に表示されている「Run Java」ボタンをクリックします。

   ![run java](img/run_java.png)

3) 右下にポップアップが表示されるので、「Yes」をクリックします。

   ![install run feature](img/run_feature_popup.png)

4) 下部のターミナルに「Hello Remote World!」と表示されればセットアップが完了です。

   ![hello remote world](img/hello_remote_world.png)

## その他

TBD

停止手順、復帰手順、制限など
