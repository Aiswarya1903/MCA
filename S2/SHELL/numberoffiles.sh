read -p "enter the directory name:" dir
direct="/home/aishu19/$dir"

if [ -d "$direct" ]
then
    num=$(find "$direct" -type f | wc -l )
    echo "$num number of files"
else
    echo "$direct is not a directory"