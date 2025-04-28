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
//12. count vowels
function countVowel(string){
    return [...string].filter(char=>"aeiouAEIOU".includes(char)).length
}
//13. remove duplicate from string
function removeDuplicateFromString(string){
    return [...new Set(string)].join("")
}

//14. longest word in the sentence
function longestWordInSentence(sentence){
    return sentence.split(" ").reduce((acc,curr)=>curr.length>acc.length?curr:acc)
}

//15. count occurrence in array
function countOccurrence(array,target){
    return array.filter(item=>item===target).length
    //return array.reduce((acc,curr)=>curr===acc?acc+1:acc,0)
}

//16. count occurrence in string
function countOccurrenceInString(string,char){
    return string.split(char).length-1;
    //return [...string].filter(ch=>char===ch).length
    //return [...string].reduce((acc,curr)=>curr===char?acc+1:acc,0)
}

//17. change to camel case
function toCamelCase(sentence){
    return sentence
        .split(" ")
        .map((word,index)=>index===0?word:word[0].toUpperCase().concat(word.slice(1)))
        .join("")
}
//18. truncate string to certain length
function truncateString(string,length){
    return string.length>length?string.slice(0,length).concat("..."):string
}

//19. check two strings are anagram or not
function checkAnagram(first,second){
    if(first.length!==second.length) return false;
    return [...first].sort().join("")===[...second].sort().join("") //due to sort O(n logn)
}
function checkAnagram(first,second){// O(n) as there is no need of sort or nested loop
    if(first.length!==second.length) return false;
    const firstFreq=[...first].reduce((acc,curr)=>{
        acc[curr]=(acc[curr]||0)+1;
        return acc;
    })
    const secondFreq=[...second].reduce((acc,curr)=>{
        acc[curr]=(acc[curr]||0)+1;
        return acc;
    })
    for(let key in firstFreq){
        if(firstFreq[key]!==secondFreq[key]){
            return false;
        }
    }
    return true;
}
function checkAnagram(first,second){ //O(n)
    if(first.length!==second.length) return false;
    let firstFreq={}
    for(let char of first){
        firstFreq[char]=(firstFreq[char]||0)+1
    }
    for(let char of second){
        if(!firstFreq[char]) return false;
        firstFreq[char]--
    }
    return true;
}

//20. most frequency element in array
function mostFrequentElement(array){
    const frequencyMap=array.reduce((acc,curr)=>{
        acc[curr]=(acc[curr]||0)+1;
        return acc;
    },{})
    return Object.keys(frequencyMap).reduce((acc,curr)=>frequencyMap[curr]>frequencyMap[acc]?curr:acc)
    //this returns single value only

    //for multiple share same frequency
    //find max frequency from array of values and find from keys that has max frequency returns array and need to map
    //to number if original is number, keys are strings
    const maxFrequency=Math.max(...Object.values(frequencyMap))
    return Object.keys(frequencyMap).filter(item=>frequencyMap[item]===maxFrequency).map(Number)
}
function maxFreqInString(string){
    let mapped={}
    let maxCount=0;
    let maxFreqElement;
    for(let char of string){
        mapped[char]=(mapped[char]||0)+1;
        if(mapped[char]>maxCount){
            maxCount=mapped[char]
            maxFreqElement=mapped[char]
        }
    }
    return maxFreqElement
}
function getMaximumOne(string){
    const mapped=[...string].reduce((acc,curr)=>{
        acc[curr]=(acc[curr]||0)+1;
        return acc;
    },{})
    return Object.keys(mapped).reduce((acc,curr)=>mapped[curr]>mapped[acc]?curr:acc)
}
function getMaximumTwo(string){
    const mapped=[...string].reduce((acc,curr)=>{
        acc[curr]=(acc[curr]||0)+1;
        return acc;
    },{})
    let maxFreq=Math.max(...Object.values(mapped))
    return Object.keys(mapped).filter(key=>mapped[key]===maxFreq)
}
function getMaximumThree(string){
    let mapped={};
    let maxFrequency=0;
    let maxFrequencyElement
    for(let char of string){
        mapped[char]=(mapped[char]||0)+1;
        if(mapped[char]>maxFrequency){
            maxFrequency=mapped[char]
            maxFrequencyElement=char
        }
    }
    return maxFrequencyElement
}
//21. compress string
function compressString(string){
    let count=1;
    let compressed="";
    let length=string.length;
    for(let i=1;i<=length;i++){
        if(string[i-1]===string[i]){
            count++;
        }else{
            compressed+=string[i-1]+count;
            count=1;
        }
    }
    return compressed.length>string.length?string:compressed;
}

//22. sort array of strings
function sortArrayOfString(array){
    return array.sort((a,b)=>a.length-b.length)
}

//23. rotate right array
function rotateRight(array,n){
    let length=array.length;
    n=n%length;
    if(n===0) return array.slice()
    return array.slice(-k).concat(array.slice(0,length-n))
}
//24. rotate left array
function rotateLeft(array,n){
    let length=array.length;
    n=n%length;
    if(n===0) return array.slice()
    return array.slice(n).concat(array.slice(0,n))
}