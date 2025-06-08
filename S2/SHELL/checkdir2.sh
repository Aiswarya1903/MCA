read -p "enter the directory to explore:" dir

for file in "$dir"/*
do
    if [ -d "$file" ]
    then
        echo "$file is a directory"
    elif [ -f "$file" ]
    then
        echo "$file is a file"
    else
        echo "$file is not a file and directory"
    fi
done