echo "enter the filename"
read file

echo "enter the content (press cntrl+D when finished)"
cat > "$file"

echo "contents of file"
cat "$file"

#to wrap filename with spaces in quotes otherwise treats them as 2 files
#eg: my file if wrapped inside "my file" treated as a single file