import re


def text_regex(reg:str, input:str):
    val = re.search(reg,input)
    return val


if __name__ == "__main__":
    reg = "/(\\.|[^[/\\\n]|\[(\\.|[^\]\\\n])*])+/([gim]+\b|\B);"
    print("Regex:", reg)
    string = "/\s+/;"
    print("Input String:", string)
    print("Result", text_regex(reg,string))
