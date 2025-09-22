#!/bin/bash
read -p "Enter Amar's age: " age1
read -p "Enter Akbar's age: " age2
read -p "Enter Anthony's age: " age3
read -p "Enter Amar's height: " h1
read -p "Enter Akbar's height: " h2
read -p "Enter Anthony's height: " h3

# Youngest
if (( age1 < age2 && age1 < age3 )); then
  echo "Amar is youngest"
elif (( age2 < age1 && age2 < age3 )); then
  echo "Akbar is youngest"
else
  echo "Anthony is youngest"
fi

# Tallest
if (( h1 > h2 && h1 > h3 )); then
  echo "Amar is tallest"
elif (( h2 > h1 && h2 > h3 )); then
  echo "Akbar is tallest"
else
  echo "Anthony is tallest"
fi
