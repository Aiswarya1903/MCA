#!bin/bash
if [ $# -eq 1 ]
then
    who > user
    echo "$1 logged at"
    grep -c $1 user
else
    echo "enter valid username"
fi