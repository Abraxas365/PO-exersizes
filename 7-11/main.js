    function getItemsAt(inArray, parity){
        outArray = [];
        if(parity=="odd"){
            if(inArray.length % 2 == 1){
                for (i = 0; i < inArray.length; i++){
                    if(i % 2 == 0) {
                        outArray.push(inArray[i]);
                    }
                }
            } else {
                for (i = 0; i < inArray.length; i++){
                    if(i % 2 == 1) {
                        outArray.push(inArray[i]);
                    }
                }
            }
        }
        
        if(parity=="even"){
            if(inArray.length % 2 == 1){
                for (i = 0; i < inArray.length; i++){
                    if(i % 2 == 1) {
                        outArray.push(inArray[i]);
                    }
                }
            } else {
                for (i = 0; i < inArray.length; i++){
                    if(i % 2 == 0) {
                        outArray.push(inArray[i]);
                    }
                }
            }
        }
        
        return outArray;
    }
    
console.log("Call the function with test case in here");