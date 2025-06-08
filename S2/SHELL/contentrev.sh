if [ $# -eq 1 ]
then
    if [ -f $1 ]
    then
        cat $1
        echo "reversed:"
        tac $1
    else
        echo "file not found"
    fi
else
    echo "enter valid filename or path"
fi