provider "aws"{
    region = var.region
    profile = var.profile
}

resource "aws_instance" "site"{
    ami ="ami-09e67e426f25ce0d7"
    instance_type = "t2.micro"
    key_name = "devops"
    #grupo de seguridad default , el que queremos
    vpc_security_group_ids = ["sg-90d69c94","sg-070c99ea4d3de6e85"]
    tags = {
        
        Name = var.name
        group = var.group

    }
}