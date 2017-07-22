**Resercher-Backend -**
  
This is a backend of a fully customizable survey spawning app with flavor of Spring Boot, MVC, Hibernate and Angular.

---
Those who are facing remembering shortcuts for -intellij, don't get deprived there is a workaround for the same:  
* Goto File>Settings 
* In search bar type keymap 
* At right hand side from the Keymaps drop down select Eclipse.
  
***Voila pretty neat eh!***

To sync your forked repo with main repo follow below steps:  
```
In your local clone of your forked repository, you can add the original GitHub repository as a "remote". ("Remotes" are like nicknames for the URLs of repositories - origin is one, for example.) Then you can fetch all the branches from that upstream repository, and rebase your work to continue working on the upstream version. In terms of commands that might look like:

# Add the remote, call it "upstream":

git remote add upstream https://github.com/whoever/whatever.git

# Fetch all the branches of that remote into remote-tracking branches,
# such as upstream/master:

git fetch upstream

# Make sure that you're on your master branch:

git checkout master

# Rewrite your master branch so that any commits of yours that
# aren't already in upstream/master are replayed on top of that
# other branch:

git rebase upstream/master

#At last
git push -f origin master
```