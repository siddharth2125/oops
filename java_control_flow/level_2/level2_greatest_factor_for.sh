#!/bin/bash
read -p "Enter a number: " number
greatest=1
for ((i=number-1; i>=1; i--)); do
  if (( number % i == 0 )); then
    greatest=$i
    break
  fi
done
echo "Greatest factor (besides itself): $greatest"
