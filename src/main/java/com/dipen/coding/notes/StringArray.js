//1. reverse a string
function reverseString(string){
    return [...string].reverse().join("")
}

//2. check palindrome
function checkPalindrome(string){
    return [...string].reverse().join("")===string
}

// 3. convert string to array
function stringToArray(string){
    return [...string]
    ///return string.split("")
}

//4. Join array to string
function arrayToString(array){
    return array.join("") //toString converts to string but add comma in between
}

//5. Find maximum
function findMaximum(array){
    return Math.max(...array)
    //return array.reduce((acc,val)=>val>acc?val:acc,array[0])
}

//6. Sum all element in array
function calculateSum(array){
    return array.reduce((sum,curr)=>sum+curr,0)
}

//.7 check if array contains an element
function checkElement(array,target){
    return array.includes(target)
    //return array.indexOf(target)
}

//8. Count occurrence of character in String
function countOccurrence(string,target){
    return string.split(target).length-1
    //return [...string].filter(char=>char===target).length
    //return [...string].reduce((acc,curr)=>acc+(target===curr?1:0),0)
}

//9. Remove duplicate from array
function removeDuplicate(array){
    return [...new Set(array)]
}

//10. Capitalize first letter
function capitalizeFirstLetter(sentence){
    return sentence
        .split(" ")
        .map(word=>word[0].toUpperCase().concat(word.slice(1)))
        .join(" ")
}

//11. remove element from array
function removeElementFromArray(array,element){
    array.splice(array.indexOf(element),1)
    return array;
    return array.filter(item=>item!==element)
}
