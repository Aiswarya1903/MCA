read -p "enter the filename" dir
filename="/home/aishu19/$dir"

if [ -d "$filename" ]
then
    echo "$filename is a directory"
else
    echo "$filename not a directory"
fi