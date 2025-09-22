#!/bin/bash
read -p "Enter a number: " number
greatest=1
i=$((number-1))
while (( i >= 1 )); do
  if (( number % i == 0 )); then
    greatest=$i
    break
  fi
  ((i--))
done
echo "Greatest factor (besides itself): $greatest"
