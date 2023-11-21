const collection = document.querySelector(".container");

const objects = [
  {
    name: "HTML",
    creator: "Creator of HTML : Tim Berners-Lee",
    releaseDate: "1999",
    image: "src/sta-je-html.jpg",
    genre: "#Structure",
    genre2:"#FrontEnd",
    paragraph:
      "The HyperText Markup Language or HTML is the standard markup language for documents designed to be displayed in a web browser. It defines the meaning and structure of web content. ",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/HTML",
    learnmore: "Learn More"
  },
  {
    name: "CSS",
    creator: "Creator of CSS : Håkon Wium Lie",
    releaseDate: "1999",
    image: "src/sta-je-css.jpeg",
    genre: "#Design",
    genre2: "#FrontEnd",
    paragraph:
      "Python is a high-level, general-purpose programming language. Its design philosophy emphasizes code readability with the use of significant indentation. Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly procedural), object-oriented and functional programming. It is often described as a `batteries included` language due to its comprehensive standard library.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/CSS",
    learnmore: "Learn More"
  },
  {
    name: "JavaScript",
    creator: "Creator of JavaScript : Brendan Eich",
    releaseDate: "1995",
    image: "src/sta-je-javascript.jpg",
    genre: "#Script",
    genre2: "#FrontEnd",
    paragraph:
      "JavaScript, often abbreviated as JS, is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS. As of 2023, 98.7% of websites use JavaScript on the client side for webpage behavior, often incorporating third-party libraries. All major web browsers have a dedicated JavaScript engine to execute the code on users' devices.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/JavaScript",
    learnmore: "Learn More"
  },
  {
    name: "C++",
    creator: "Creator of C++ : Bjarne Stroustrup",
    releaseDate: "1985",
    image: "src/C++.png",
    genre: "#Compiled",
    genre2:"#BackEnd",
    paragraph:
      "C++, pronounced `C plus plus` and sometimes abbreviated as CPP) is a high-level, general-purpose programming language created by Danish computer scientist Bjarne Stroustrup. First released in 1985 as an extension of the C programming language, it has since expanded significantly over time; as of 1997 C++ has object-oriented, generic, and functional features, in addition to facilities for low-level memory manipulation. It is almost always implemented as a compiled language, and many vendors provide C++ compilers, including the Free Software Foundation, LLVM, Microsoft, Intel, Embarcadero, Oracle, and IBM.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/C%2B%2B",
    learnmore: "Learn More"
  },
  {
    name: "C#",
    creator: "Creator of C# : Mads Torgersen",
    releaseDate: "1985",
    image: "src/csharp1200x628.png",
    genre: "#Dynamic",
    genre2:"#Nominative",
    paragraph:
      "C# (pronounced See sharp) is a general-purpose high-level programming language supporting multiple paradigms. C# encompasses static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/C_Sharp_(programming_language)",
    learnmore: "Learn More"
  },
  {
    name: "Python",
    creator: "Creator of Python : Guido van Rossum",
    releaseDate: "1991",
    image: "src/python.png",
    genre: "#Structured",
    genre2:"#Reflective",
    paragraph:
      "C# (pronounced See sharp) is a general-purpose high-level programming language supporting multiple paradigms. C# encompasses static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/Python_(programming_language)",
    learnmore: "Learn More"
  },
  {
    name: "Ruby",
    creator: "Creator of Ruby : Yukihiro Matsumoto",
    releaseDate: "1995",
    image: "src/Ruby-Jobs-Dice.png",
    genre: "#Oriented",
    genre2:"#Reflective",
    paragraph:
      "Ruby is an interpreted, high-level, general-purpose programming language which supports multiple programming paradigms. It was designed with an emphasis on programming productivity and simplicity. In Ruby, everything is an object, including primitive data types. It was developed in the mid-1990s by Yukihiro `Matz` Matsumoto in Japan.Ruby is dynamically typed and uses garbage collection and just-in-time compilation. It supports multiple programming paradigms, including procedural, object-oriented, and functional programming. According to the creator, Ruby was influenced by Perl, Smalltalk, Eiffel, Ada, BASIC, Java, and Lisp.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/Ruby_(programming_language)",
    learnmore: "Learn More"
  },
  {
    name: "PHP",
    creator: "Creator of Ruby : Rasmus Lerdorf",
    releaseDate: "1995",
    image: "src/php.jpg",
    genre: "#Dynamic",
    genre2:"#Gradual",
    paragraph:
    "PHP is a general-purpose scripting language geared towards web development.It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1993 and released in 1995. The PHP reference implementation is now produced by the PHP Group. PHP was originally an abbreviation of Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/PHP",
    learnmore: "Learn More"
  },
  {
    name: "SQL",
    creator: "Creator of Ruby : Donald D. Chamberlin",
    releaseDate: "1974",
    image: "src/SQL2.png",
    genre: "#Dynamic",
    genre2:"#Gradual",
    paragraph:
    "Structured Query Language (SQL), sometimes `sequel` for historical reasons) is a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS), or for stream processing in a relational data stream management system (RDSMS). It is particularly useful in handling structured data, i.e., data incorporating relations among entities and variable",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/SQL",
    learnmore: "Learn More"
  },
  {
    name: "Swift",
    creator: "Creator of Ruby : Chris Lattner",
    releaseDate: "2014",
    image: "src/swift.png",
    genre: "#Block Structured",
    genre2:"#Declarative",
    paragraph:
    "Swift is a high-level general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. and the open-source community. First released in June 2014,Swift was developed as a replacement for Apple's earlier programming language Objective-C, as it had been largely unchanged since the early 1980s and lacked modern language features. Swift works with Apple's Cocoa and Cocoa Touch frameworks, and a key aspect of Swift's design was the ability to interoperate with the huge body of existing Objective-C code developed for Apple products over the previous decades. It was built with the open source LLVM compiler framework and has been included in Xcode since version 6, released in 2014. On Apple platforms,it uses the Objective-C runtime library, which allows C, Objective-C, C++ and Swift code to run within one program.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/Swift_(programming_language)",
    learnmore: "Learn More"
  },
  {
    name: "Fortran",
    creator: "Creator of Ruby : John Backus",
    releaseDate: "1957",
    image: "src/Fortran.png",
    genre: "#Structured",
    genre2:"#Imperative",
    paragraph:
    "Fortran was originally developed by IBM in the 1950s for scientific and engineering applications, and subsequently came to dominate scientific computing. It has been in use for over seven decades in computationally intensive areas such as numerical weather prediction, finite element analysis, computational fluid dynamics, geophysics, computational physics, crystallography and computational chemistry. It is a popular language for high-performance computing and is used for programs that benchmark and rank the world's fastest supercomputers.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/Fortran",
    learnmore: "Learn More"
  },
  {
    name: "Java",
    creator: "Creator of Ruby : James Gosling",
    releaseDate: "1995",
    image: "src/java.jpeg",
    genre: "#Object Oriented",
    genre2:"#Reflective",
    paragraph:
    "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most popular programming languages in use according to GitHub,particularly for client–server web applications, with a reported 9 million developers.",
    del_item: "x",
    link: "https://en.wikipedia.org/wiki/Java_(programming_language)",
    learnmore: "Learn More"
  },
];



objects.forEach((object) => {
  const card = document.createElement("div");
  card.classList.add("rounded","bg-white","overflow-hidden","shadow-lg","grid","grid-rows-col3","hover:shadow-lg","hover:shadow-black/5","dark:hover:shadow-black/50","duration-100","ease-in-out");

  const image = document.createElement("img");
  image.src = object.image;
  card.appendChild(image);
  image.classList.add("w-full");

  const divText = document.createElement("div");
  divText.classList.add("px-6","py-4")
  card.appendChild(divText)

  const title = document.createElement("div");
  title.textContent = object.name;
  title.classList.add("font-bold","text-xl","mb-2");
  divText.appendChild(title);

  const creator = document.createElement("p");
  creator.textContent = object.creator;
  creator.classList.add("text-gray-700","text-base","font-bold","py-4");
  divText.appendChild(creator)

  const paragraph = document.createElement("p");
  paragraph.textContent = object.paragraph;
  paragraph.classList.add("text-gray-700","text-base","m-auto");
  divText.appendChild(paragraph)

  const genrediv = document.createElement("div");
  genrediv.classList = ("px-6","pt-4","pb-2");
  genrediv.classList.add("px-6","pt-4","pb-2")
  card.appendChild(genrediv)

  const genre = document.createElement("span")
  genre.textContent = object.genre;
  genre.classList.add("inline-block","bg-gray-200","rounded-full","px-3","py-1","text-sm","font-semibold","text-gray-700","mr-2","mb-2")
  genrediv.appendChild(genre)
  const genre2 = document.createElement("span")
  genre2.textContent = object.genre2;
  genre2.classList.add("inline-block","bg-gray-200","rounded-full","px-3","py-1","text-sm","font-semibold","text-gray-700","mr-2","mb-2")
  genrediv.appendChild(genre2)

  const divline = document.createElement("div")
  divline.classList.add("relative","flex","py-5","items-center")
  genrediv.appendChild(divline)

  const line1 = document.createElement("div")
  line1.classList.add("flex-grow","border-t","border-gray-400")
  divline.appendChild(line1)

  const learn = document.createElement("a")
  learn.textContent = object.learnmore;
  learn.classList.add("flex-shrink","mx-4","text-gray-600")
  learn.href = object.link;
  divline.appendChild(learn)


  const line2 = document.createElement("div")
  line2.classList.add("flex-grow","border-t","border-gray-400")
  divline.appendChild(line2)

  const del_Item = document.createElement("button");
  del_Item.textContent = object.del_item;
  del_Item.classList.add("del_Item","float-right","rounded-full","h-10","w-10","hover:bg-red-600");
  title.appendChild(del_Item);


  collection.appendChild(card);
});


document.querySelectorAll('.del_Item').forEach(btn => btn.addEventListener("click", function(e){
  this.parentNode.parentNode.parentNode.style.transform = 'translateY(-5000px)';
  setTimeout(() => {
      this.parentNode.parentNode.parentNode.remove();
  }
  , 200);
}));