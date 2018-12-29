 # QA Automation Training<br />
 Java – Programing Language<br />
 Selenium Webdriver – Tool to automate web application testing<br />
 Cucumber – Tool that supports behavior driven development<br />
 Junit – JUnit is a unit testing framework<br />
 TestNG – TestNG is a testing framework<br /> 
 Maven/Gradle – Tool for build & dependency management<br />
 GitHub/Bitbucket - Web-based hosting service for version control using Git<br />
 Jenkins/Bamboo - Automation server for continuous integration and delivery<br />
 Eclipse/IntelliJ – Tool for development<br />
 Jira/ZenHub – Tool which allows bug tracking and agile project management<br />
 Firefox With Firebug – Browser to locate Web Elements<br />
 JMeter - Load testing tool for analyzing and measuring the performance of a variety of services<br />

# GIT CHEAT SHEET<br />
Git is the open source distributed version control system that facilitates GitHub activities on your laptop or
desktop. This cheat sheet summarizes commonly used Git command line instructions for quick reference.<br />

# INSTALL GIT<br />
GitHub for Windows<br />
htps://windows.github.com<br />
GitHub for Mac<br />
htps://mac.github.com<br />
Git for All Platforms<br />
htp://git-scm.com<br />

# CONFIGURE TOOLING<br />
Configure user information for all local repositories<br />
$ git config --global user.name "[name]"<br />
Sets the name you want atached to your commit transactions<br />
$ git config --global user.email "[email address]"<br />
Sets the email you want atached to your commit transactions<br />
$ git config --global color.ui auto<br />
Enables helpful colorization of command line output<br />

# CREATE REPOSITORIES<br />
Start a new repository or obtain one from an existing URL<br />
$ git init [project-name]<br />
Creates a new local repository with the specified name<br />
$ git clone [url]<br />
Downloads a project and its entire version history<br />

# MAKE CHANGES<br />
Review edits and craf a commit transaction<br />
$ git status<br />
Lists all new or modified files to be commited<br />
$ git add [file]<br />
Snapshots the file in preparation for versioning<br />
$ git reset [file]<br />
Unstages the file, but preserve its contents<br />
$ git diff<br />
Shows file differences not yet staged<br />
$ git diff --staged<br />
Shows file differences between staging and the last file version<br />
$ git commit -m "[descriptive message]"<br />
Records file snapshots permanently in version history<br />

# GROUP CHANGES<br />
Name a series of commits and combine completed efforts<br />
$ git branch<br />
Lists all local branches in the current repository<br />
$ git branch [branch-name]<br />
Creates a new branch<br />
$ git checkout [branch-name]<br />
Switches to the specified branch and updates the working directory<br />
$ git merge [branch]<br />
Combines the specified branch’s history into the current branch<br />
$ git branch -d [branch-name]<br />
Deletes the specified branch<br />

# REFACTOR FILENAMES<br />
Relocate and remove versioned files<br />
$ git rm [file]<br />
Deletes the file from the working directory and stages the deletion<br />
$ git rm --cached [file]<br />
Removes the file from version control but preserves the file locally<br />
$ git mv [file-original] [file-renamed]<br />
Changes the file name and prepares it for commit<br />

# SUPPRESS TRACKING<br />
Exclude temporary files and paths<br />
$ git ls-files --other --ignored --exclude-standard<br />
Lists all ignored files in this project<br />
*.log<br />
build/<br />
temp-*<br />
A text file named .gitignore suppresses accidental versioning of files and paths matching the specified paterns<br />

# SAVE FRAGMENTS<br />
Shelve and restore incomplete changes<br />
$ git stash<br />
Temporarily stores all modified tracked files<br />
$ git stash list<br />
Lists all stashed changesets<br />
$ git stash pop<br />
Restores the most recently stashed files<br />
$ git stash drop<br />
Discards the most recently stashed changeset<br />

# REVIEW HISTORY<br />
Browse and inspect the evolution of project files<br />
$ git log<br />
Lists version history for the current branch<br />
$ git log --follow [file]<br />
Lists version history for a file, including renames<br />
$ git diff [first-branch]...[second-branch]<br />
Shows content differences between two branches<br />
$ git show [commit]<br />
Outputs metadata and content changes of the specified commit<br />

# REDO COMMITS<br />
Erase mistakes and craf replacement history<br />
$ git reset [commit]<br />
Undoes all commits afer [commit], preserving changes locally<br />
$ git reset --hard [commit]<br />
Discards all history and changes back to the specified commit<br />

# SYNCHRONIZE CHANGES<br />
Register a repository bookmark and exchange version history<br />
$ git fetch [bookmark]<br />
Downloads all history from the repository bookmark<br />
$ git merge [bookmark]/[branch]<br />
Combines bookmark’s branch into current local branch<br />
$ git push [alias] [branch]<br />
Uploads all local branch commits to GitHub<br />
$ git pull<br />
Downloads bookmark history and incorporates changes<br />
