#1.input a page file to yourself copy it into other existing file
#2.start printing file in certain line
#3.print all the difference between two files copy the two files
#4.print lines matching certain word pattern

read -p "enter the filename:" file
echo "enter the contents of file1:"
cat > "$file"
read -p "enter the existing file name:" file2
echo "file 1 to file 2"
cp "$file" "$file2"
cat "$file2"

read -p "enter the filename:" file
read -p "enter the line number:" l
sed -n "$l,\$p" $file

read -p "enter file name:" file1
read -p "enter file name:" file2
read -p "enter file name:" file3
echo "contents of file1"
cat "$file1"
echo "contents of file 2"
cat "$file2"
echo "difference of file 1 and file 2 saved to file 3"
diff -a "$file1" "$file2" > "$file3"  #a adds even if it is in binary
cat $file3

read -p "enter the name of the file:" file
echo "enter the contents:"
cat > $file
read -p "enter the pattern:" p
grep -i "$p" "$file"