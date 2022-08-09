:beginner: _**GIT L1 COMMANDS**_  



Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### cat kickstart.txt
Kick start the album

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        kickstart.txt

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git add kickstart.txt
warning: LF will be replaced by CRLF in kickstart.txt.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   kickstart.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git commit -am "Kickstart Album (Alondra)"
[master (root-commit) f2793c8] Kickstart Album (Alondra)
 1 file changed, 1 insertion(+)
 create mode 100644 kickstart.txt

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git status
On branch master
nothing to commit, working tree clean

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git log
commit f2793c81a9478b7f7bb278abcd10da2c8b19c59d (HEAD -> master)
Author: DEV <dev@dev.com>
Date:   Fri Aug 5 21:14:31 2022 +0530

    Kickstart Album (Alondra)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git config --global user.name "Saul The Singer"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git config --global user.email "Saul@TheUniversalSinger.com"

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### echo "Canta Y No LLores" >> Canta.mp3

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Canta.mp3

nothing added to commit but untracked files present (use "git add" to track)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git add Canta.mp3
warning: LF will be replaced by CRLF in Canta.mp3.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   Canta.mp3


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git commit -am "Canta ready"
[master c950800] Canta ready
 1 file changed, 1 insertion(+)
 create mode 100644 Canta.mp3

 Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git log --oneline
c950800 (HEAD -> master) Canta ready
f2793c8 Kickstart Album (Alondra)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git branch background

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git branch
  background
* master

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git checkout background
Switched to branch 'background'

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (background)
##### echo "Metallic background recorded" >> metal_background.mp3

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (background)
##### git add .
warning: LF will be replaced by CRLF in metal_background.mp3.
The file will have its original line endings in your working directory

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (background)
##### git commit -am "Metallic Background done"
[background 6a9d61c] Metallic Background done
 1 file changed, 1 insertion(+)
 create mode 100644 metal_background.mp3

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (background)
##### git checkout master
Switched to branch 'master'

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git checkout background
Switched to branch 'background'

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (background)
##### git log
commit 6a9d61c4c9cb520ba84a7c1dd5b9299db69260a4 (HEAD -> background)
Author: Saul The Singer <Saul@TheUniversalSinger.com>
Date:   Fri Aug 5 21:48:15 2022 +0530

    Metallic Background done

commit c950800b1ad7789a3f53ba9b0e74dc9d41ed30a1 (master)
Author: Saul The Singer <Saul@TheUniversalSinger.com>
Date:   Fri Aug 5 21:26:05 2022 +0530

    Canta ready

commit f2793c81a9478b7f7bb278abcd10da2c8b19c59d
Author: DEV <dev@dev.com>
Date:   Fri Aug 5 21:14:31 2022 +0530

    Kickstart Album (Alondra)


Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (background)
##### git switch master
Switched to branch 'master'

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git log
commit c950800b1ad7789a3f53ba9b0e74dc9d41ed30a1 (HEAD -> master)
Author: Saul The Singer <Saul@TheUniversalSinger.com>
Date:   Fri Aug 5 21:26:05 2022 +0530

    Canta ready

commit f2793c81a9478b7f7bb278abcd10da2c8b19c59d
Author: DEV <dev@dev.com>
Date:   Fri Aug 5 21:14:31 2022 +0530

    Kickstart Album (Alondra)

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (background)
##### git switch master
Switched to branch 'master'

Enzo@DESKTOP-IFP1VO4 MINGW64 ~/Desktop/MEXcel/TheGitSong (master)
##### git log
commit c950800b1ad7789a3f53ba9b0e74dc9d41ed30a1 (HEAD -> master)
Author: Saul The Singer <Saul@TheUniversalSinger.com>
Date:   Fri Aug 5 21:26:05 2022 +0530

    Canta ready

commit f2793c81a9478b7f7bb278abcd10da2c8b19c59d
Author: DEV <dev@dev.com>
Date:   Fri Aug 5 21:14:31 2022 +0530

    Kickstart Album (Alondra)

```
