from pathlib import Path
import base64
import zlib


def encode_text(data: str) -> str:
    return base64.urlsafe_b64encode(zlib.compress(data.encode("utf-8"), 9)).decode()


LANG_DICT = {
    "plantuml": "https://kroki.io/c4plantuml/svg/{data}",
    "blockdiag": "https://kroki.io/blockdiag/svg/{data}",
}


def process(input: Path):
    encode_flag = False
    lang = ""
    data_collected = []
    for line in input.read_text().splitlines():
        if line.startswith("```") and not encode_flag:
            encode_flag = True
            lang = line[3:]
            yield ""
            continue

        if line.startswith("```") and encode_flag:
            encode_flag = False
            link = LANG_DICT.get(lang).format(
                data=encode_text("\n".join(data_collected))
            )
            yield "![]({link})".format(link=link)
            data_collected = []
            continue

        if not encode_flag:
            yield line

        if encode_flag:
            data_collected.append(line)


Path(r"D:\dev\farm-dev\docs\discussions\001-requirements-analysis.proc.md").write_text(
    "\n".join(
        process(Path(r"D:\dev\farm-dev\docs\discussions\001-requirements-analysis.md"))
    )
)
