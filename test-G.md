## Bug *&Gamma;*
So far, our parser demonstrates basic recognition of,
>[inline-style links](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#links)

And can distinguish against the similar looking image formatting that uses an `!` preceeding its square brackets `[]` 
>if you noticed above - I am using these square brackets to highlight an example

- in this case, not all brackets are used exclusively for linking
- as well as not all parenthesis are used solely for linking and are regularly used in standard body of text to hold an example or commentary...
> For example, these (paired parenthesis) are still coupled to the last recognized square brackets.
> The parser then may get confused and display unexpected symptoms. 
## EOF